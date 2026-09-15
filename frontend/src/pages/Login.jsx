import { Link } from 'react-router-dom'

function Login() {
  return (
    <main className="flex min-h-screen items-center justify-center bg-[var(--bg)] px-4">
      <div className="w-full max-w-md">
        {/* Logo / título */}
        <div className="mb-8 text-center">
          <h1 className="text-4xl font-bold tracking-tight text-[var(--text-h)]">
            Educa360
          </h1>

          <p className="mt-2 text-[var(--text)]">
            Inicia sesión en tu cuenta
          </p>
        </div>

        {/* Card */}
        <div className="rounded-2xl border border-[var(--border)] bg-[var(--bg)] p-8 shadow-lg">
          <form className="space-y-5">
            {/* Email */}
            <div>
              <label
                htmlFor="email"
                className="mb-2 block text-sm font-medium text-[var(--text-h)]"
              >
                Correo electrónico
              </label>

              <input
                id="email"
                name="email"
                type="email"
                placeholder="tu@email.com"
                className="
                  w-full
                  rounded-lg
                  border
                  border-[var(--border)]
                  bg-transparent
                  px-4
                  py-3
                  text-[var(--text-h)]
                  outline-none
                  transition
                  placeholder:text-[var(--text)]
                  focus:border-[var(--accent)]
                  focus:ring-2
                  focus:ring-[var(--accent-bg)]
                "
              />
            </div>

            {/* Contraseña */}
            <div>
              <div className="mb-2 flex items-center justify-between">
                <label
                  htmlFor="password"
                  className="block text-sm font-medium text-[var(--text-h)]"
                >
                  Contraseña
                </label>

                <Link
                  to="/forgot-password"
                  className="text-sm font-medium text-[var(--accent)] hover:underline"
                >
                  ¿Olvidaste tu contraseña?
                </Link>
              </div>

              <input
                id="password"
                name="password"
                type="password"
                placeholder="••••••••"
                className="
                  w-full
                  rounded-lg
                  border
                  border-[var(--border)]
                  bg-transparent
                  px-4
                  py-3
                  text-[var(--text-h)]
                  outline-none
                  transition
                  placeholder:text-[var(--text)]
                  focus:border-[var(--accent)]
                  focus:ring-2
                  focus:ring-[var(--accent-bg)]
                "
              />
            </div>

            {/* Recordarme */}
            <div className="flex items-center gap-2">
              <input
                id="remember"
                name="remember"
                type="checkbox"
                className="
                  h-4
                  w-4
                  rounded
                  border-[var(--border)]
                  accent-[var(--accent)]
                "
              />

              <label
                htmlFor="remember"
                className="text-sm text-[var(--text)]"
              >
                Recordarme
              </label>
            </div>

            {/* Botón */}
            <button
              type="submit"
              className="
                w-full
                rounded-lg
                bg-[var(--accent)]
                px-4
                py-3
                font-semibold
                text-white
                transition
                hover:opacity-90
                focus:outline-none
                focus:ring-2
                focus:ring-[var(--accent-border)]
                focus:ring-offset-2
              "
            >
              Iniciar sesión
            </button>
          </form>

          {/* Registro */}
          <p className="mt-6 text-center text-sm text-[var(--text)]">
            ¿No tienes una cuenta?{' '}
            <Link
              to="/register"
              className="font-semibold text-[var(--accent)] hover:underline"
            >
              Crear cuenta
            </Link>
          </p>
        </div>
      </div>
    </main>
  )
}

export default Login