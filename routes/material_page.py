"""This module defines the routes for the material page."""

from flask import render_template, Blueprint

material_page = Blueprint('material_page', __name__)

@material_page.route('/introduction', methods=["GET"])
def introduction():
    """Return for front-end the material-page html"""

    return render_template('material/introduction.html')



@material_page.route('/basic_syntax', methods=["GET"])
def basic_syntax():
    """Return for front-end the material-page html"""

    return render_template('material/basic_syntax.html')


@material_page.route('/method_and_access', methods=["GET"])
def method_and_access():
    """Return for front-end the material-page html"""

    return render_template('material/method_and_access.html')


@material_page.route('/class_hierarchy', methods=["GET"])
def class_hierarchy():
    """Return for front-end the material-page html"""

    return render_template('material/class_hierarchy.html')
