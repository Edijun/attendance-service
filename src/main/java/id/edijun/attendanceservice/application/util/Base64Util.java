package id.edijun.attendanceservice.application.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import javax.imageio.ImageIO;

public class Base64Util {

	public static String encodeToBase64(BufferedImage image) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(image, "jpg", baos);
		byte[] imageBytes = baos.toByteArray();
		return Base64.getEncoder().encodeToString(imageBytes);
	}

	public static BufferedImage decodeFromBase64(String base64) throws IOException {
		byte[] imageBytes = Base64.getDecoder().decode(base64);
		return ImageIO.read(new ByteArrayInputStream(imageBytes));
	}

}
