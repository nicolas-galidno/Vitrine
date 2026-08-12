import { useState } from "react";

import Home from "./pages/Home/Home";
import Login from "./pages/Login/Login";

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