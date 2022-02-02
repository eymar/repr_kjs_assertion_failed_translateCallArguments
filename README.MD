**Stacktrace:**
```
java.lang.AssertionError: Assertion failed
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCallArguments(jsAstUtils.kt:343)
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:111)
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:219)
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:23)
at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.maybeOptimizeIntoSwitch(IrElementToJsStatementTransformer.kt:71)
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitReturn(IrElementToJsStatementTransformer.kt:97)
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitReturn(IrElementToJsStatementTransformer.kt:20)
at org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl.accept(IrReturnImpl.kt:34)
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitBlockBody(IrElementToJsStatementTransformer.kt:30)
at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitBlockBody(IrElementToJsStatementTransformer.kt:20)
at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBody.kt:54)
```


**How to reproduce:**


`./gradlew jsBrowserRun`

it doesn't fail if
line 19 in Main.kt is commented:

```kotlin
...
///val difficulty = object {}
...
```
