def powerV1(x: Double, n: Int): Double =
  if (n == 0) 1.0
  else if (n % 2 == 1) x * powerV1(x, n - 1)
  else powerV1(x * x, n / 2)

inline def powerV2(x: Double, inline n: Int): Double =
  inline if (n == 0) 1.0
  else inline if (n % 2 == 1) x * powerV2(x, n - 1)
  else powerV2(x * x, n / 2)

@main def main() = {
  // Not inlined code
  println(powerV1(2, 2))
  println(powerV1(2, 3))

  val x: Double = 2
  val y: Int = 4

  println(powerV1(x, y))

  // Inlined code
  println(powerV2(2, 2))
  println(powerV2(2, 3))

  // println(powerV2(x, y))
  println(powerV2(x, 4))
}
