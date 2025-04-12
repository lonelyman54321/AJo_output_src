/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.firebase.messaging;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class TopicOperation {
    private static final String OLD_TOPIC_PREFIX = "/topics/";
    static final String OPERATION_PAIR_DIVIDER = "!";
    private static final String TOPIC_NAME_PATTERN = "[a-zA-Z0-9-_.~%]{1,900}";
    private static final Pattern TOPIC_NAME_REGEXP = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final String operation;
    private final String serializedString;
    private final String topic;

    private TopicOperation(String string2, String string3) {
        String string4;
        this.topic = string4 = TopicOperation.normalizeTopicOrThrow(string3, string2);
        this.operation = string2;
        this.serializedString = string2 = n1.a(string2, OPERATION_PAIR_DIVIDER, string3);
    }

    public static TopicOperation from(String object) {
        int n3;
        int n4 = TextUtils.isEmpty((CharSequence)object);
        String string2 = null;
        if (n4 != 0) {
            return null;
        }
        Object object2 = OPERATION_PAIR_DIVIDER;
        n4 = ((String[])(object = object.split((String)object2, -1))).length;
        if (n4 != (n3 = 2)) {
            return null;
        }
        string2 = object[0];
        object = object[1];
        object2 = new TopicOperation(string2, (String)object);
        return object2;
    }

    private static String normalizeTopicOrThrow(String string2, String object) {
        int n3;
        CharSequence charSequence;
        boolean bl2;
        if (string2 != null && (bl2 = string2.startsWith((String)(charSequence = OLD_TOPIC_PREFIX)))) {
            String string3 = "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in ";
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append((String)object);
            object = ".";
            ((StringBuilder)charSequence).append((String)object);
            n3 = 8;
            string2 = string2.substring(n3);
        }
        if (string2 != null && (n3 = ((Matcher)(object = TOPIC_NAME_REGEXP.matcher(string2))).matches()) != 0) {
            return string2;
        }
        string2 = cP.a("Invalid topic name: ", string2, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}.");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static TopicOperation subscribe(String string2) {
        TopicOperation topicOperation = new TopicOperation("S", string2);
        return topicOperation;
    }

    public static TopicOperation unsubscribe(String string2) {
        TopicOperation topicOperation = new TopicOperation("U", string2);
        return topicOperation;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof TopicOperation;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        object = (TopicOperation)object;
        String string2 = this.topic;
        String string3 = ((TopicOperation)object).topic;
        bl3 = string2.equals(string3);
        if (bl3 && (bl2 = (string2 = this.operation).equals(object = ((TopicOperation)object).operation))) {
            bl4 = true;
        }
        return bl4;
    }

    public String getOperation() {
        return this.operation;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String string2 = this.operation;
        String string3 = this.topic;
        Object[] objectArray = new Object[]{string2, string3};
        return Objects.hashCode(objectArray);
    }

    public String serialize() {
        return this.serializedString;
    }
}

