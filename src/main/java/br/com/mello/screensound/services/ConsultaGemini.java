package br.com.mello.screensound.services;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class ConsultaGemini {

    public static String obterInformacao(String entrada) {

        ChatLanguageModel gemini = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("GEMNI_KEY"))
                .modelName("gemini-1.5-flash")
                .build();

        String res = gemini.generate("Me fale sobre o Artista: " + entrada);
        return res;
    }
}