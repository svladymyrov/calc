fun main() {
  val result = calc("4+3*2-5")
  println(result)
}

fun calc(expr: String): Int {
    return 2
}

/**

if: op in expr has a priority over op in stack or stack is empty
    push op to stack
else: pop two nums from stack, pop op from stack
      form expr with op from stack,
      push expr to num stack
      compare cur op to the next op in stack
if: expr size 0
    pop op, pop two elem from num stack, form expr, push to num stack
    repeat until op stack is empty

 * */

/**
 *
 * TODO PROJECT:
 *  - calculator
 *    * operators: +, -, *, /, ^, (, )
 *    * history of prev calculations
 *    * support for different notations: algebraic, PN, RPN
 *
 *  Goal
 *    - learn corresponding data structures and algorithms
 *    - kotlin syntax
 *    - design solution on paper
 *
 *  Steps
 *    - design interface
 *    - describe entities and relations between them
 *    - write use cases. Cover edge cases first
 *    - setup new project and GH repo
 *    - high level solution (algorithm)
 *    - try to solve problems (expression to AST algo, AST evaluation, etc.) on your own
 *    - define gaps in knowledge, write questions, fill in the gaps
 *
 *
 * */

/**
 * Calculator interface
 *  - calculate(input: String): <Int | Double>
 *  - history(): Array<String>
 *
 * Entities
 *  - Calculator
 *  - Parser(expression: String): <AST>
 *  - Evaluator(obj: <AST>): <Int | Double>
 *  - MathFunc(a: <Int | Double>, b: <Int | Double>, op: Char): <Int | Double>
 *  - History
 *    - set(expression: String, result: <Int | Double>): Unit
 *    - get(): Array<String>
 *    - clear(): Unit
 *
 * Use cases:
 * - 2 + 3 * 4 Operator precedence
 * - (2 + 3) * 4 Parentheses
 * - 2 / 0
 * - negative numbers
 * - decimals
 * - incorrect expression, e.g. "zero + 10 divide by 2"
 * - big numbers
 * - deeply nested expressions (i.e a lot of nested parentheses)
 * */

// (3 + 2) * 4 - 44 / 4 => 3 2 + 4 * 44 4 / -
