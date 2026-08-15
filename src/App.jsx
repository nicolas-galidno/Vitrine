import { useState } from "react";

import Home from "./pages/home/home";
import Login from "./pages/login/login";

function App() {
  const [pagina, setPagina] = useState("home");

  if (pagina === "login") {
    return (
      <Login
        voltar={() => setPagina("home")}
      />
    );
  }

  return (
    <Home
      entrar={() => setPagina("login")}
    />
  );
}

export default App;