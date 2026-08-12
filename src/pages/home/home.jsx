import "./home.css";

function Home({ entrar }) {
  return (
    <main className="home">
      <div className="home-container">

        <header className="home-header">
          <h2 className="logo">Vitrine</h2>
        </header>

        <section className="home-content">

          <h1>
            Encontre.
            <br />
            Divulgue.
            <br />
            Conecte.
          </h1>

          <p>
            Encontre pequenos negócios, produtos e serviços
            em um só lugar.
          </p>

          <div className="home-buttons">

            <button
              className="btn btn-primary"
              onClick={entrar}
            >
              Entrar
            </button>

            <button
              className="btn btn-secondary"
            >
              Criar minha conta
            </button>

          </div>

        </section>

      </div>
    </main>
  );
}

export default Home;