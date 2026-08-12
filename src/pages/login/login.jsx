import "./Login.css";

function Login({ voltar }) {
    return (
        <main className="login">
            <div className="login-container">

                <button className="back-button" onClick={voltar}>
                    ← Voltar
                </button>

                <section className="login-content">

                    <div className="login-header">
                        <span className="login-logo">Vitrine</span>

                        <h1>Bem-vindo de volta!</h1>

                        <p>
                            Entre na sua conta para continuar.
                        </p>
                    </div>

                    <form className="login-form">

                        <div className="form-group">
                            <label htmlFor="email">
                                E-mail
                            </label>

                            <input
                                type="email"
                                id="email"
                                placeholder="Digite seu e-mail"
                            />
                        </div>

                        <div className="form-group">
                            <label htmlFor="senha">
                                Senha
                            </label>

                            <input
                                type="password"
                                id="senha"
                                placeholder="Digite sua senha"
                            />
                        </div>

                        <button
                            type="submit"
                            className="login-button"
                        >
                            Entrar
                        </button>

                    </form>

                    <p className="register-text">
                        Ainda não possui uma conta?
                        <button className="register-link">
                            Criar conta
                        </button>
                    </p>

                </section>

            </div>
        </main>
    );
}

export default Login;