/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.example

import org.example.App
import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
