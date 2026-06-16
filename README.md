# JACCL - Jewelry & Accessories Commerce App

A modern Android application built with **Kotlin** and **Jetpack Compose** for buying and selling jewelry and accessories online. The app features user authentication, product management, and real-time data synchronization powered by Firebase.

## 🎯 About

**JACCL** is a comprehensive e-commerce mobile application designed to facilitate the buying and selling of jewelry and accessories. Whether you're a vendor looking to showcase your products or a customer searching for beautiful jewelry items, JACCL provides an intuitive and seamless experience.

## ✨ Key Features

- **User Authentication** - Secure email and password-based authentication with Firebase
- **Product Catalog** - Browse, search, and filter jewelry and accessories
- **Inventory Management** - Vendors can upload, edit, and manage their product listings
- **Product Details** - View detailed product information including images, pricing, and quantity
- **Real-time Updates** - Seamless synchronization with Firebase Firestore database
- **Image Upload** - Support for product images with Firebase Cloud Storage integration
- **Responsive UI** - Modern Material 3 design with Jetpack Compose
- **Navigation** - Smooth navigation between different app screens using Compose Navigation

## 🛠️ Technology Stack

### Frontend
- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern declarative UI framework
- **Material 3** - Latest Material Design components
- **Compose Navigation** - Type-safe navigation between screens
- **Coil** - Image loading and caching library

### Backend & Data
- **Firebase Authentication** - User account management
- **Firebase Firestore** - Real-time database for products and user data
- **Firebase Cloud Storage** - Image storage for product photos
- **Firebase Realtime Database** - Additional data synchronization

### Build & Development
- **Gradle** - Build automation with Kotlin DSL
- **Android SDK** - Target API 34 (Android 14)
- **JDK 1.8** - Java compatibility

## 📋 Project Structure

```
My-project/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/jaccl/
│   │   │   │   ├── MainActivity.kt              # Main application entry point
│   │   │   │   ├── models/
│   │   │   │   │   ├── User.kt                  # User data model
│   │   │   │   │   ├── Product.kt               # Product data model
│   │   │   │   │   └── Upload.kt                # Product upload model
│   │   │   │   ├── ui/
│   │   │   │   │   └── theme/                   # UI theming configuration
│   │   │   │   ├── data/
│   │   │   │   │   ├── AuthViewModel.kt         # Authentication logic
│   │   │   │   │   └── ProductViewModel.kt      # Product management logic
│   │   │   │   └── navigation/
│   │   │   │       ├── AppNavHost.kt            # Navigation setup
│   │   │   │       └── Routes.kt                # Route definitions
│   │   │   ├── res/                             # Resources (images, strings, layouts)
│   │   │   └── AndroidManifest.xml              # App configuration
│   │   ├── test/                                # Unit tests
│   │   └── androidTest/                         # Android instrumented tests
│   ├── build.gradle.kts                         # Module build configuration
│   ├── proguard-rules.pro                       # Code obfuscation rules
│   └── google-services.json                     # Firebase configuration
├── build.gradle.kts                             # Root build configuration
├── gradle.properties                            # Gradle properties
├── settings.gradle.kts                          # Project settings
├── gradlew                                      # Gradle wrapper (Unix)
├── gradlew.bat                                  # Gradle wrapper (Windows)
└── README.md                                    # This file
```

## 📦 Data Models

### User
Represents a user account in the system.
```kotlin
class User {
    var email: String = ""
    var pass: String = ""
    var userid: String = ""
}
```

### Product
Represents a product available for purchase.
```kotlin
class Product {
    var name: String = ""
    var quantity: String = ""
    var price: String = ""
    var id: String = ""
}
```

### Upload
Represents a product being uploaded by a vendor, including image URL.
```kotlin
class Upload {
    var name: String = ""
    var quantity: String = ""
    var price: String = ""
    var imageUrl: String = ""
    var id: String = ""
}
```

## 🚀 Getting Started

### Prerequisites
- Android Studio (latest version)
- Android SDK 34 or higher
- Kotlin 1.5 or higher
- JDK 1.8 or higher
- Firebase account (for backend services)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Onyinge/My-project.git
   cd My-project
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing Android Studio project"
   - Navigate to the cloned directory and select it

3. **Configure Firebase**
   - Create a Firebase project at [Firebase Console](https://console.firebase.google.com/)
   - Add an Android app to your Firebase project
   - Download the `google-services.json` file
   - Place it in the `app/` directory (replace the existing one)

4. **Build the project**
   ```bash
   ./gradlew build
   ```

5. **Run the app**
   - Connect an Android device or start an emulator
   - Click "Run" in Android Studio or use:
   ```bash
   ./gradlew installDebug
   ```

## 🔐 Authentication

The app uses Firebase Authentication for user management. Users can:
- Sign up with email and password
- Sign in to existing accounts
- Securely manage their user credentials

## 💾 Database Schema (Firestore)

### Users Collection
```
/users/{userId}/
├── email: String
├── userid: String
└── pass: String (hashed in production)
```

### Products Collection
```
/products/{productId}/
├── name: String
├── quantity: String
├── price: String
├── id: String
├── imageUrl: String (optional)
└── vendorId: String (optional)
```

## 🎨 UI/UX

The app uses Material 3 design principles with:
- Modern color schemes and typography
- Responsive layouts that adapt to different screen sizes
- Smooth animations and transitions
- Accessible navigation flows

## 📱 Supported Devices

- **Minimum SDK**: API 24 (Android 7.0)
- **Target SDK**: API 34 (Android 14)
- **Supported devices**: Phones and tablets

## 🧪 Testing

Unit tests are located in `app/src/test/`
Instrumented tests are located in `app/src/androidTest/`

Run tests with:
```bash
./gradlew test              # Unit tests
./gradlew connectedAndroidTest  # Instrumented tests
```

## 🔧 Build Variants

The app supports the following build types:
- **Debug** - Development build with debugging enabled
- **Release** - Production-ready build with code optimization

## 📝 Version Information

- **Current Version**: 1.0
- **Version Code**: 1
- **Minimum SDK**: 24
- **Target SDK**: 34

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/YourFeatureName`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/YourFeatureName`)
5. Open a Pull Request

## 📄 License

This project is open source. See the LICENSE file for more details.

## 👨‍💼 Author

**Onyinge** - [GitHub Profile](https://github.com/Onyinge)

## 🆘 Support & Issues

If you encounter any bugs or have suggestions for improvements:
- [Open an issue](https://github.com/Onyinge/My-project/issues) on GitHub
- Provide a detailed description of the problem
- Include steps to reproduce the issue if applicable

## 🔗 Resources

- [Jetpack Compose Documentation](https://developer.android.com/jetpack/compose)
- [Firebase Documentation](https://firebase.google.com/docs)
- [Android Development](https://developer.android.com)
- [Kotlin Documentation](https://kotlinlang.org/docs/home.html)

## 📚 Additional Documentation

For more information about specific components:
- Navigation flow: See `navigation/Routes.kt` and `navigation/AppNavHost.kt`
- Authentication: See `data/AuthViewModel.kt`
- Product management: See `data/ProductViewModel.kt`

---

**Made with ❤️ by Onyinge**

Happy coding! 🚀
