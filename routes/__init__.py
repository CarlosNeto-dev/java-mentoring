"""This file talks about the importation of all modules on this folder."""

from routes.home_page import home_page_bp
from routes.material_page import material_page

def register_routes(app) -> None:
    """
    This function have the objective of register routes from the files.

    :param app: Will receive the app of the app.py.
    :return: None
    """

    blueprints = [home_page_bp, material_page]

    for blueprint in blueprints:
        app.register_blueprint(blueprint)
