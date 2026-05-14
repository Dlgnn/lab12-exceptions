public class DungeonLog implements AutoCloseable {
    private boolean closed = false;
    private final StringBuilder log = new StringBuilder(); 
    
    public void write(String entry) {
        if (!closed) {
            log.append(entry).append("\n");
        }
    }

    public boolean isClosed() { return closed; }

    @Override
    public void close() {
        this.closed = true;
    }
}