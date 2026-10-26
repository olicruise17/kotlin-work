// Oliver Cruise
// StudentID: 201823825

// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // test for when size of list is 1

    "Median is correct when size of list is 1" {
        val data = listOf(1.0)
        median(data) shouldBe (1.0)
    }

    // test for when size of list is 2

    "Median is correct when size of list is 2" {
        val data = listOf(1.0,2.0)
        median(data) shouldBe (1.5)
    }

    // test for when size of list is 3

    "Median is correct when size of list is 3" {
        val data = listOf(1.0,2.0,3.0)
        median(data) shouldBe (2.0)
    }

    // test for when size of list is 4
    
    "Median is correct when size of list is 4" {
        val data = listOf(1.0,2.0,3.0,4.0)
        median(data) shouldBe (2.5)
    }


})
