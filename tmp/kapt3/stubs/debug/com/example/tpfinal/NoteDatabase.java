package com.example.tpfinal;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.tpfinal.NoteConverters.class})
@androidx.room.Database(entities = {com.example.tpfinal.Note.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/tpfinal/NoteDatabase;", "Landroidx/room/RoomDatabase;", "()V", "noteDao", "Lcom/example/tpfinal/NoteDao;", "Companion", "app_debug"})
public abstract class NoteDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.tpfinal.NoteDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.example.tpfinal.NoteDatabase INSTANCE;
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    
    public NoteDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.tpfinal.NoteDao noteDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/tpfinal/NoteDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/tpfinal/NoteDatabase;", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "buildDatabase", "context", "Landroid/content/Context;", "getDatabase", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tpfinal.NoteDatabase getDatabase(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final com.example.tpfinal.NoteDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}