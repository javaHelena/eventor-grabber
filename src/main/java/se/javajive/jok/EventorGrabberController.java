package se.javajive.jok;

import io.micronaut.http.annotation.*;

@Controller("/eventor-grabber")
public class EventorGrabberController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}