package com.example.tenantmanagementsystem2

// A Tenant holds the details of one tenant.
data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) {
    // Returns the text we want to show on the screen.
    fun summary(): String {
        return "Tenant: $name\nPhone: $phone\nRent: KSh $rent"
    }
}