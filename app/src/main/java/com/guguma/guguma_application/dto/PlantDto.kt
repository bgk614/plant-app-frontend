package com.guguma.guguma_application.dto

data class PlantDto (
    val id: Long, // 추가된 필드
    val name: String,
    val nickname: String,
    val imageUrl: String,
    var isSelected: Boolean = false // 선택 상태 추가
)