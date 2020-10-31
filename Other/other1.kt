fun main(vararg args: String) {
  println("Hello")
  
  
  var input = "a((b)c"
  
  
  var openPosition = mutableListOf<Int>();
  var positionRemove = mutableSetOf<Int>();
  for (i in 0..input.length - 1) {
    if (input[i] == '(') {
      openPosition.add(i)
      println("add for ( $i")
    } else if (input[i] == ')') {
      if (openPosition.size == 0) {
        println("remove for no ( $i")
        positionRemove.add(i)
      } else {
        println("remove for ) $i removing position ${openPosition.size - 1}")
        openPosition.removeAt(openPosition.size - 1)
      }
      println("openPosition size:: ${openPosition.size} when $i")
    }
  }
  positionRemove.addAll(openPosition)
  println("positionRemove size:: ${positionRemove.size}")
  var result = ""
  for (i in 0..input.length - 1) {
    if (!positionRemove.contains(i)) {
      println("remove position ${input[i]}")
      result += input[i]
    }
  }
  O(n +n*n)
  println("result:[ $result ]")
}



// Your last Python3 code is saved below:
// '''

// Remove minimal number of parentheses in order to make the input string balanced.

// Input: the string to be balanced
// Return: a result string that has balanced parentheses

// *Example 1:*
// Input: "()())()"
// Return: "()()()" [ OR "(())()"]


// *Example 2:*
// Input: "(a)())()"
// Return: "(a)()()" [ OR "(a())()"]

// *Example 3:*
// Input: "()(((a)"
// Return: "()(a)"

// *Example 4:*
// Input: ")("
// Return: ""
// '''

// possible outputs "", "abc", "()", "a()", "a()b"

// (())

// print("Hello")

// ()())()
// []
// if ( 
  
//  or )



