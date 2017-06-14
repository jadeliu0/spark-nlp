package com.jsl.nlp.annotators.sbd.pragmatic

/**
  * Created by Saif Addin on 6/3/2017.
  */
object PragmaticSymbols extends RuleSymbols {

  /**
    * ====================
    * BREAKING SYMBOLS
    * ====================
    */

  /**
    * Punctuation line breaker
    * alt 200
    */
  val PUNCT_INDICATOR = "╚"

  /**
    * Ellipsis breaker
    * looks up -> "..."
    * alt 203
    */
  val ELLIPSIS_INDICATOR = "╦"

  /**
    * Double punctuations marker
    * alt 205-208
    */
  val DP_FIRST = "═" // ?!
  val DP_SECOND = "╬" // !?
  val DP_THIRD = "╧" // ??
  val DP_FOURTH = "╨" // !!

  /**
    * =====================
    * NON BREAKING SYMBOLS
    * =====================
    */

  /**
    * Non separation dots for abbreviations
    * looks up -> .
    * alt 198
    */
  val ABBREVIATOR = "╞"

  /**
    * Non separation dots for numbers
    * looks up -> .
    * alt 199
    */
  val NUM_INDICATOR = "╟"

  /**
    * Period container non breaker
    * looks up -> .
    * alt 201
    */
  val MULT_PERIOD = "╔"

  /**
    * Special non breaking symbol
    * alt 202
    */
  val SPECIAL_PERIOD = "╩"

  /**
    * Question in quotes
    * alt 209
    */
  val QUESTION_IN_QUOTE = "╤" // ?

  /**
    * Exclamation mark in rules
    * alt 210
    */
  val EXCLAMATION_INDICATOR = "╥" // !


  override def symbolRecovery: Map[String, String] = super.symbolRecovery ++ Map(
    ABBREVIATOR -> ".",
    NUM_INDICATOR -> ".",
    MULT_PERIOD -> ".",
    QUESTION_IN_QUOTE -> "?",
    EXCLAMATION_INDICATOR -> "!",
    ELLIPSIS_INDICATOR -> "...",
    DP_FIRST -> "?!",
    DP_SECOND-> "!?",
    DP_THIRD -> "??",
    DP_FOURTH -> "!!"
  )

}
