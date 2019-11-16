/**
 * YOU DON'T NEED THAT SHIT...
 */
// package com.example.openliberty.mp.web.socket.example.mvc.config;
//
// import lombok.extern.slf4j.Slf4j;
//
// import javax.inject.Inject;
// import javax.servlet.ServletContext;
// import javax.ws.rs.GET;
// import javax.ws.rs.Path;
// import javax.ws.rs.PathParam;
// import javax.ws.rs.core.Response;
//
// @Slf4j
// @Path("{path: ^(META-INF/|resources/).*}")
// public class StaticResourcesResource {
//
//     @Inject
//     ServletContext context;
//
//     /**
//      * Serving static files form folders:
//      * <p>
//      * /resources/...
//      * /META-INF/...
//      */
//
//     @GET
//     public Response staticResources(@PathParam("path") final String path) {
//         log.info("handling assets: {}", path);
//         var resource = context.getResourceAsStream(String.format("%s", path));
//         return null == resource
//                 ? Response.status(Response.Status.NOT_FOUND).build()
//                 : Response.ok().entity(resource).build();
//     }
// }
