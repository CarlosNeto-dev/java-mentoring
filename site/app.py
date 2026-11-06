"""This file talks about the main app of the flask application."""

from flask import Flask, render_template, url_for, blueprints
from routes import register_routes

# Os arquivos estáticos ficam em public/static. No Vercel, tudo o que está em public/
# é servido direto pela CDN; no Docker e no computador, o Flask serve a mesma pasta em /static.
app = Flask(__name__, static_folder="public/static", static_url_path="/static")

register_routes(app)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5001, debug = True)
