"""This file talks about the home page routes"""

from flask import render_template, Blueprint

home_page_bp = Blueprint("home", __name__)

@home_page_bp.route("/", methods = ["GET"]) # This configuration is the default, but i will show it for better transparence.
def home():
    """Return for front-end the home-page html"""

    return render_template("home/index.html")


@home_page_bp.route("/about_us", methods = ["GET"])
def about_us():
    """Return for front-end the about-page html"""

    return render_template("home/about_us.html")
