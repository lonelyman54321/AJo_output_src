/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.builders;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.Indexable$Builder;
import com.google.firebase.appindexing.builders.AggregateRatingBuilder;
import com.google.firebase.appindexing.builders.AlarmBuilder;
import com.google.firebase.appindexing.builders.AlarmInstanceBuilder;
import com.google.firebase.appindexing.builders.AudiobookBuilder;
import com.google.firebase.appindexing.builders.BookBuilder;
import com.google.firebase.appindexing.builders.ConversationBuilder;
import com.google.firebase.appindexing.builders.DigitalDocumentBuilder;
import com.google.firebase.appindexing.builders.DigitalDocumentPermissionBuilder;
import com.google.firebase.appindexing.builders.GeoShapeBuilder;
import com.google.firebase.appindexing.builders.LocalBusinessBuilder;
import com.google.firebase.appindexing.builders.MessageBuilder;
import com.google.firebase.appindexing.builders.MusicAlbumBuilder;
import com.google.firebase.appindexing.builders.MusicGroupBuilder;
import com.google.firebase.appindexing.builders.MusicPlaylistBuilder;
import com.google.firebase.appindexing.builders.MusicRecordingBuilder;
import com.google.firebase.appindexing.builders.PersonBuilder;
import com.google.firebase.appindexing.builders.PlaceBuilder;
import com.google.firebase.appindexing.builders.PostalAddressBuilder;
import com.google.firebase.appindexing.builders.ReservationBuilder;
import com.google.firebase.appindexing.builders.StickerBuilder;
import com.google.firebase.appindexing.builders.StickerPackBuilder;
import com.google.firebase.appindexing.builders.StopwatchBuilder;
import com.google.firebase.appindexing.builders.StopwatchLapBuilder;
import com.google.firebase.appindexing.builders.TimerBuilder;

public final class Indexables {
    private Indexables() {
    }

    public static AggregateRatingBuilder aggregateRatingBuilder() {
        AggregateRatingBuilder aggregateRatingBuilder = new AggregateRatingBuilder();
        return aggregateRatingBuilder;
    }

    public static AlarmBuilder alarmBuilder() {
        AlarmBuilder alarmBuilder = new AlarmBuilder();
        return alarmBuilder;
    }

    public static AlarmInstanceBuilder alarmInstanceBuilder() {
        AlarmInstanceBuilder alarmInstanceBuilder = new AlarmInstanceBuilder();
        return alarmInstanceBuilder;
    }

    public static AudiobookBuilder audiobookBuilder() {
        AudiobookBuilder audiobookBuilder = new AudiobookBuilder();
        return audiobookBuilder;
    }

    public static BookBuilder bookBuilder() {
        BookBuilder bookBuilder = new BookBuilder();
        return bookBuilder;
    }

    public static ConversationBuilder conversationBuilder() {
        ConversationBuilder conversationBuilder = new ConversationBuilder();
        return conversationBuilder;
    }

    public static DigitalDocumentBuilder digitalDocumentBuilder() {
        DigitalDocumentBuilder digitalDocumentBuilder = new DigitalDocumentBuilder();
        return digitalDocumentBuilder;
    }

    public static DigitalDocumentPermissionBuilder digitalDocumentPermissionBuilder() {
        DigitalDocumentPermissionBuilder digitalDocumentPermissionBuilder = new DigitalDocumentPermissionBuilder();
        return digitalDocumentPermissionBuilder;
    }

    public static MessageBuilder emailMessageBuilder() {
        MessageBuilder messageBuilder = new MessageBuilder("EmailMessage");
        return messageBuilder;
    }

    public static GeoShapeBuilder geoShapeBuilder() {
        GeoShapeBuilder geoShapeBuilder = new GeoShapeBuilder();
        return geoShapeBuilder;
    }

    public static LocalBusinessBuilder localBusinessBuilder() {
        LocalBusinessBuilder localBusinessBuilder = new LocalBusinessBuilder();
        return localBusinessBuilder;
    }

    public static MessageBuilder messageBuilder() {
        MessageBuilder messageBuilder = new MessageBuilder();
        return messageBuilder;
    }

    public static MusicAlbumBuilder musicAlbumBuilder() {
        MusicAlbumBuilder musicAlbumBuilder = new MusicAlbumBuilder();
        return musicAlbumBuilder;
    }

    public static MusicGroupBuilder musicGroupBuilder() {
        MusicGroupBuilder musicGroupBuilder = new MusicGroupBuilder();
        return musicGroupBuilder;
    }

    public static MusicPlaylistBuilder musicPlaylistBuilder() {
        MusicPlaylistBuilder musicPlaylistBuilder = new MusicPlaylistBuilder();
        return musicPlaylistBuilder;
    }

    public static MusicRecordingBuilder musicRecordingBuilder() {
        MusicRecordingBuilder musicRecordingBuilder = new MusicRecordingBuilder();
        return musicRecordingBuilder;
    }

    public static Indexable newSimple(String string2, String string3) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(string3);
        Indexable$Builder indexable$Builder = new Indexable$Builder();
        indexable$Builder.setUrl(string3);
        return ((Indexable$Builder)indexable$Builder.setName(string2)).build();
    }

    public static DigitalDocumentBuilder noteDigitalDocumentBuilder() {
        DigitalDocumentBuilder digitalDocumentBuilder = new DigitalDocumentBuilder("NoteDigitalDocument");
        return digitalDocumentBuilder;
    }

    public static PersonBuilder personBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        return personBuilder;
    }

    public static PlaceBuilder placeBuilder() {
        PlaceBuilder placeBuilder = new PlaceBuilder();
        return placeBuilder;
    }

    public static PostalAddressBuilder postalAddressBuilder() {
        PostalAddressBuilder postalAddressBuilder = new PostalAddressBuilder();
        return postalAddressBuilder;
    }

    public static DigitalDocumentBuilder presentationDigitalDocumentBuilder() {
        DigitalDocumentBuilder digitalDocumentBuilder = new DigitalDocumentBuilder("PresentationDigitalDocument");
        return digitalDocumentBuilder;
    }

    public static ReservationBuilder reservationBuilder() {
        ReservationBuilder reservationBuilder = new ReservationBuilder();
        return reservationBuilder;
    }

    public static LocalBusinessBuilder restaurantBuilder() {
        LocalBusinessBuilder localBusinessBuilder = new LocalBusinessBuilder("Restaurant");
        return localBusinessBuilder;
    }

    public static DigitalDocumentBuilder spreadsheetDigitalDocumentBuilder() {
        DigitalDocumentBuilder digitalDocumentBuilder = new DigitalDocumentBuilder("SpreadsheetDigitalDocument");
        return digitalDocumentBuilder;
    }

    public static StickerBuilder stickerBuilder() {
        StickerBuilder stickerBuilder = new StickerBuilder();
        return stickerBuilder;
    }

    public static StickerPackBuilder stickerPackBuilder() {
        StickerPackBuilder stickerPackBuilder = new StickerPackBuilder();
        return stickerPackBuilder;
    }

    public static StopwatchBuilder stopwatchBuilder() {
        StopwatchBuilder stopwatchBuilder = new StopwatchBuilder();
        return stopwatchBuilder;
    }

    public static StopwatchLapBuilder stopwatchLapBuilder() {
        StopwatchLapBuilder stopwatchLapBuilder = new StopwatchLapBuilder();
        return stopwatchLapBuilder;
    }

    public static DigitalDocumentBuilder textDigitalDocumentBuilder() {
        DigitalDocumentBuilder digitalDocumentBuilder = new DigitalDocumentBuilder("TextDigitalDocument");
        return digitalDocumentBuilder;
    }

    public static TimerBuilder timerBuilder() {
        TimerBuilder timerBuilder = new TimerBuilder();
        return timerBuilder;
    }
}

