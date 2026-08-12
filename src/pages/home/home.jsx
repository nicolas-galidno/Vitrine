import "./home.css";

function home() {
  return (
    <><main className="home">
      <div className="home__container">

        <header className="home__header">
          <h2 className="logo">Vitrine</h2>
        </header>

        <section className="home-content">
          <h1>
            Encontre
            <br />
            Divulgue
            <br />
            Conecte.
          </h1>

          <p>
            Encontre pequenos negócios, produtos e serviços em um só lugar.
          </p>

          <div className="home-buttons">
            <button className="btn btn--primary">Entrar
            </button>

            <button className="btn btn-secondary">Criar minha conta
            </button>
          </div>
        </section>

      </div>
    </main><footer className="home__footer">
        <p>© 2026 Vitrine. Todos os direitos reservados.</p>
      </footer></>
  );
}

export default home;