package com.example.cryptomonitor

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CryptoViewModel : ViewModel() {

    private val _preco = MutableStateFlow("R$ 0,00")
    val preco: StateFlow<String> = _preco

    fun atualizarPreco() {
        viewModelScope.launch {
            try {
                val resposta = RetrofitConfig.service.getBitcoinPrice()
                _preco.value = "R$ ${resposta.ticker.last}"
            } catch (e: Exception) {
                _preco.value = "Erro ao consultar"
            }
        }
    }
}
