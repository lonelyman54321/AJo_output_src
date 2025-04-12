/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.session.PlaybackState
 *  android.media.session.PlaybackState$Builder
 *  android.media.session.PlaybackState$CustomAction
 *  android.media.session.PlaybackState$CustomAction$Builder
 *  android.os.Bundle
 */
package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

class PlaybackStateCompat$Api21Impl {
    private PlaybackStateCompat$Api21Impl() {
    }

    public static void addCustomAction(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    public static PlaybackState.CustomAction build(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    public static PlaybackState build(PlaybackState.Builder builder) {
        return builder.build();
    }

    public static PlaybackState.Builder createBuilder() {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        return builder;
    }

    public static PlaybackState.CustomAction.Builder createCustomActionBuilder(String string2, CharSequence charSequence, int n3) {
        PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(string2, charSequence, n3);
        return builder;
    }

    public static String getAction(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    public static long getActions(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    public static long getActiveQueueItemId(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    public static long getBufferedPosition(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    public static List getCustomActions(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    public static CharSequence getErrorMessage(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    public static Bundle getExtras(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    public static int getIcon(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    public static long getLastPositionUpdateTime(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    public static CharSequence getName(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    public static float getPlaybackSpeed(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    public static long getPosition(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    public static int getState(PlaybackState playbackState) {
        return playbackState.getState();
    }

    public static void setActions(PlaybackState.Builder builder, long l2) {
        builder.setActions(l2);
    }

    public static void setActiveQueueItemId(PlaybackState.Builder builder, long l2) {
        builder.setActiveQueueItemId(l2);
    }

    public static void setBufferedPosition(PlaybackState.Builder builder, long l2) {
        builder.setBufferedPosition(l2);
    }

    public static void setErrorMessage(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    public static void setExtras(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void setState(PlaybackState.Builder builder, int n3, long l2, float f5, long l3) {
        builder.setState(n3, l2, f5, l3);
    }
}

