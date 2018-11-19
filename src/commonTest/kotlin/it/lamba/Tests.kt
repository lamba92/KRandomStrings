package it.lamba

import it.lamba.random.*
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Tests {

    @Test
    fun testUUID() {
        for (i in 0 until 10) {
            val uuid = Random.uuid()
            println("generated uuid: $uuid")
            assertEquals(36, uuid.length)
            assertTrue { uuid[8] == '-' }
            assertTrue { uuid[13] == '-' }
            assertTrue { uuid[18] == '-' }
            assertTrue { uuid[23] == '-' }
            assertTrue { uuid[14] == '4' }
            assertTrue { uuid[19] == 'a' || uuid[19] == 'b'
                    || uuid[19] == '8' || uuid[19] == '9' }
        }
        for (i in 0 until 10) {
            val uuid = Random.uuid(true)
            println("generated uuid: $uuid")
            assertEquals(36, uuid.length)
            assertTrue { uuid[8] == '-' }
            assertTrue { uuid[13] == '-' }
            assertTrue { uuid[18] == '-' }
            assertTrue { uuid[23] == '-' }
            assertTrue { uuid[14] == '4' }
            assertTrue { uuid[19] == 'A' || uuid[19] == 'B'
                    || uuid[19] == '8' || uuid[19] == '9' }
        }
    }
}