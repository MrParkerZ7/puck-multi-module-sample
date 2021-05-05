rootProject.name = "main_project"

include ("../utils_project")
project(":utils_project").projectDir = file("../utils_project")

include ("../webflux_project")
project(":webflux_project").projectDir = file("../webflux_project")
