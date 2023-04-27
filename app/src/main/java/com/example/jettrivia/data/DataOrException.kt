package com.example.jettrivia.data

data class DataOrException<T,Boolean,E:Exception>(
    //data wrapper
    var data:T?=null,
    var loading:Boolean?=null,
    var e:E?=null
)
