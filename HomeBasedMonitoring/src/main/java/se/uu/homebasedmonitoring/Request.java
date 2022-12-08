package se.uu.homebasedmonitoring;

import java.time.LocalDateTime;

public class Request implements RequestSubscriber{

    private int requestId;
    private Requester requester;
    private Responder responder;
    private LocalDateTime startTime;
    private int estimatedDuration;
    private String description;
    private Topic jobType;
    private RequestStatus state;

    public RequestStatus trackRequest(Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void updateState(Request request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Requester getRequester() {
        return requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    public Responder getResponder() {
        return responder;
    }

    public void setResponder(Responder responder) {
        this.responder = responder;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getJobType() {
        return jobType;
    }

    public void setJobType(Topic jobType) {
        this.jobType = jobType;
    }

    public RequestStatus getState() {
        return state;
    }

    public void setState(RequestStatus state) {
        this.state = state;
    }
}
