package main

// import grails.artefact.Enhances
// import org.grails.core.artefact.ControllerArtefactHandler
//
// @Enhances(ControllerArtefactHandler.TYPE)
trait WhoAmITrait {

   def currentUsername() {
      "foo"
   }
}
