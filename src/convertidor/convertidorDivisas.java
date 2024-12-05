package convertidor;

import modelo.Divisa;

public class convertidorDivisas {

    private static final double USD = 1.0;
    private static final double MXN = 20.18;
    private static final double EUR = 0.93;
    private static final double JPY = 152.69;
    private static final double GBP = 0.77;

    public double convertirADolar(double cantidad, Divisa divisaOrigen) {
        switch (divisaOrigen) {
            case USD:
                return cantidad;
            case MXN:
                return cantidad / MXN;
            case EUR:
                return cantidad / EUR;
            case JPY:
                return cantidad / JPY;
            case GBP:
                return cantidad / GBP;
            default:
                return 0;
        }
    }

    public double convertirDeDolar(double cantidad, Divisa divisaDestino) {
        switch (divisaDestino) {
            case USD:
                return cantidad;
            case MXN:
                return cantidad * MXN;
            case EUR:
                return cantidad * EUR;
            case JPY:
                return cantidad * JPY;
            case GBP:
                return cantidad * GBP;
            default:
                return 0;
        }
    }

    public String obtenerNombreDivisa(Divisa divisa) {
        switch (divisa) {
            case USD: return "USD";
            case MXN: return "MXN";
            case EUR: return "EUR";
            case JPY: return "JPY";
            case GBP: return "GBP";
            default: return "Desconocido";
        }
    }
}
