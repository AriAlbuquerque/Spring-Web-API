package dio.web.api.handler;

public class CampoObrigatorioException extends BusinessException {
    public CampoObrigatorioException(String message) {
        super("O campo %s é obrigatório");
    }

    public CampoObrigatorioException(String message, Object params) {
        super(message, params);
    }
}
