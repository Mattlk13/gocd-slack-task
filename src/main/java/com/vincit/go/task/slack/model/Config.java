package com.vincit.go.task.slack.model;

import com.google.gson.annotations.SerializedName;

public class Config {

    @SerializedName("Message")
    private Property message;
    @SerializedName("Title")
    private Property title;
    @SerializedName("IconOrEmoji")
    private Property iconOrEmoji;
    @SerializedName("Channel")
    private Property channel;
    @SerializedName("ChannelType")
    private Property channelType;
    @SerializedName("WebhookUrl")
    private Property webhookUrl;

    public Config() {
    }

    private String getValueOr(Property property, String value) {
        if (property != null) {
            return property.getValueOr(value);
        } else {
            return value;
        }
    }

    public String getMessage() {
        return getValueOr(message, null);
    }

    public String getTitle() {
        return getValueOr(title, null);
    }

    public String getIconOrEmoji() {
        return getValueOr(iconOrEmoji, null);
    }

    public String getChannel() {
        return getValueOr(channel, null);
    }

    public String getWebhookUrl() {
        return getValueOr(webhookUrl, null);
    }

    public ChannelType getChannelType() {
        String value = getValueOr(channelType, null);
        if (value != null) {
            return ChannelType.valueOf(value);
        } else {
            return null;
        }
    }
}
