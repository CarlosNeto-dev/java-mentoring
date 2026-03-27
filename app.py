"""This file talks about the main app of the flask application."""

from flask import Flask, render_template, url_for, blueprints
from routes import register_routes

app = Flask(__name__)

register_routes(app)

if __name__ == "__main__":
    app.run(debug = True)
