public class FakeExchange implements Exchange{
    @Override
    public float rate(String origin, String target) {
        // Hardcoded exchange rates for testing
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.85f; // Assume 1 USD = 0.85 EUR
        }
        return 1.0f; // Default to 1:1 for unknown currencies
    }
}
