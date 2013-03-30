package scalgos

import util.Random.{nextInt, nextDouble}

/**
 * Collection of randomized algorithms
 */
object Randomizations {

  /**
   * @return Random Integer in [@param start, @param end]
   */
  def randomInteger(start: Int = 0, end: Int) = {
    assume(end > start)
    start + nextInt(end - start + 1)
  }

  /**
   * @return Random Double in [@param start, @param end]
   */
  def randomNumber(start: Double = 0, end: Double) = {
    assume(end > start)
    start + (end - start)*nextDouble()
  }

  def findKth[T: Ordering](a: Seq[T], k: Int) = ???
}