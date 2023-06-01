package com.practicum.imdbapi.data

import com.practicum.imdbapi.data.dto.Response

interface NetworkClient {
    fun doRequest(dto: Any): Response
}