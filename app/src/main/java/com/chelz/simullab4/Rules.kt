package com.chelz.simullab4

class Rules {

	companion object {

		fun retrieveValue(self: Int, neighbours: Int): Int {
			return when (self) {
				1    -> ifSelfIsLive(neighbours)
				0    -> ifSelfIsDead(neighbours)
				else -> 0
			}
		}

		private fun ifSelfIsDead(neighbours: Int): Int {
			return if (neighbours == 3) {
				1
			} else
				0
		}

		private fun ifSelfIsLive(neighbours: Int): Int {
			return when (neighbours) {
				4, 5, 6, 7, 8 -> 0
				1, 0          -> 0
				2, 3          -> 1
				else          -> 0
			}
		}
	}


}

