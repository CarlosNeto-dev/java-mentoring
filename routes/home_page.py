"""This file talks about the home page routes"""

from flask import render_template, Blueprint

home_page_bp = Blueprint("home", __name__)

@home_page_bp.route("/")
def home():
    return render_template("testing.html")
