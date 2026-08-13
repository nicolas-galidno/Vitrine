import "./home.css";

function Home({ entrar }) {
  return (
    <main className="home">

      <nav className="navbar">
        <div className="navbar-logo">
          Vitrine
        </div>

        <div className="navbar-buttons">
          <button className="navbar-register">
            Registrar
          </button>

          <button
            className="navbar-login"
            onClick={entrar}
          >
            Login
          </button>
        </div>
      </nav>

      <section className="home-content">

        <h1>
          Vitrine
        </h1>

        <h2>
          Simples para quem vende,
          <br />
          inteligente para quem procura.
        </h2>

        <div className="home-buttons">

          <button className="register-button">
            Registrar
          </button>

          <button
            className="login-button"
            onClick={entrar}
          >
            Login
          </button>

        </div>

      </section>

    </main>
  );
}

export default Home;