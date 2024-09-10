package org.moqui.openai

import io.github.jetkai.openai.OpenAI
import io.github.jetkai.openai.api.CompletionRequest
import io.github.jetkai.openai.api.data.completion.response.CompletionResponse

import java.time.Duration

class GPTService {

    private static final String OPENAI_API_KEY = "MY_API_KEY"
    private static final String OPENAI_ORG = "YOUR_ORGANIZATION_ID"

    static String getAnswer(String prompt) {
        // Create OpenAI instance
        OpenAI openAI = OpenAI.builder()
                .setApiKey(OPENAI_API_KEY)
                .setOrganization(OPENAI_ORG) // Optional organization ID
                .setTimeout(Duration.ofSeconds(10)) // Optional timeout
                .build()

        // Build completion request
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(prompt)
                .maxTokens(100) // Set token limit
                .build()

        // Send request and get response
        CompletionResponse response = openAI.createCompletion(completionRequest)
        return response.getChoices().get(0).getText().trim() // Get the first response
    }
}
