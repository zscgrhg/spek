package org.jetbrains.spek.api.extension.execution

import org.jetbrains.spek.api.annotation.Beta
import org.jetbrains.spek.api.extension.Extension
import org.jetbrains.spek.api.extension.TestExtensionContext

/**
 * @author Ranie Jade Ramiso
 */
@Beta
interface BeforeExecuteTest: Extension {
    fun beforeExecuteTest(test: TestExtensionContext)
}
