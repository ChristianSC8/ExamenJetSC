package pe.edu.upeu.examsc3r.model

data class ResultResponse(
    var codigo: String,
    var mensaje: String,
    var data: ArrayList<Result>
)