"""This module defines the routes for the material page."""

from flask import render_template, Blueprint

material_page = Blueprint('material_page', __name__)

@material_page.route('/material', methods=["GET"])
def material():
    """Return for front-end the material-page html"""
    
    return render_template('page_two/index.html')
