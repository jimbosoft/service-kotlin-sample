package au.com.millsoft.sample

import au.com.millsoft.sample.handler.Awesome
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Beans() {
    @Bean
    fun exampleConstruction() = Awesome("Kotlin")
}
