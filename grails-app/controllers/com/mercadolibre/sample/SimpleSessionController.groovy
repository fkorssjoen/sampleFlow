package com.mercadolibre.sample

class SimpleSessionController {

    def index = {
		def sessionID = session.id
		
		int step
		try{
			step = session.stepNumber
			step++
			session.stepNumber = step			
			}catch(Exception e){
			session.stepNumber = 0
			}
		
		session.sessionSequence = sessionID + "-" + System.currentTimeMillis().toString()
		
		
		}
	
	
	def testFlow = {
		init{
			action{
				flow.actualStep = new String("a")
				flow.stepNumber = 1
				valid()
				}
			on("valid").to("firstStep")
			}
		
		firstStep{
			on("next"){
				flow.actualStep = new String("b")
				flow.stepNumber = 2
				}.to("secondStep")

			}
		
		secondStep{
			on("next"){
				flow.actualStep = new String("c")
				flow.stepNumber = 3
				}.to("thirdStep")
			on("back"){
				flow.actualStep = new String("a")
				flow.stepNumber = 1
				}.to("firstStep")
		}		
				
		thirdStep{
			on("back"){
				flow.actualStep = new String("b")
				flow.stepNumber = 2
				}.to("secondStep")
			
			}	
				
			
		
		
		}
}