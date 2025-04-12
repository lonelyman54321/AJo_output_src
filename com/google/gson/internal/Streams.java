/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Streams$AppendableWriter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams {
    private Streams() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JsonElement parse(JsonReader object) {
        void var0_6;
        JsonSyntaxException jsonParseException;
        boolean bl2;
        block9: {
            MalformedJsonException malformedJsonException2222;
            block11: {
                IOException iOException2222;
                block10: {
                    try {
                        try {
                            ((JsonReader)object).peek();
                            bl2 = false;
                            jsonParseException = null;
                        }
                        catch (EOFException eOFException) {
                            bl2 = true;
                            break block9;
                        }
                        try {
                            TypeAdapter typeAdapter = TypeAdapters.JSON_ELEMENT;
                            object = typeAdapter.read((JsonReader)object);
                            return (JsonElement)object;
                        }
                        catch (EOFException eOFException) {
                            break block9;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                    }
                    catch (IOException iOException2222) {
                        break block10;
                    }
                    catch (MalformedJsonException malformedJsonException2222) {
                        break block11;
                    }
                    JsonSyntaxException jsonSyntaxException = new JsonSyntaxException(numberFormatException);
                    throw jsonSyntaxException;
                }
                JsonIOException jsonIOException = new JsonIOException(iOException2222);
                throw jsonIOException;
            }
            JsonSyntaxException jsonSyntaxException = new JsonSyntaxException(malformedJsonException2222);
            throw jsonSyntaxException;
        }
        if (bl2) {
            return JsonNull.INSTANCE;
        }
        jsonParseException = new JsonSyntaxException((Throwable)var0_6);
        throw jsonParseException;
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        boolean bl2 = appendable instanceof Writer;
        if (bl2) {
            appendable = (Writer)appendable;
        } else {
            Streams$AppendableWriter streams$AppendableWriter = new Streams$AppendableWriter(appendable);
            appendable = streams$AppendableWriter;
        }
        return appendable;
    }
}

