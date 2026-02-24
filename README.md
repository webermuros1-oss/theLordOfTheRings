# Proyecto Señor de los Anillos - POO Java

## Descripción
Implementación completa de **Programación Orientada a Objetos** en Java usando personajes del Señor de los Anillos:

✅ **Encapsulación**: Atributos `private` con getters/setters  
✅ **Herencia**: 5 razas que heredan de superclase `Character`  
✅ **Polimorfismo**: Método `printDetails()` sobrescrito en cada subclase  
✅ **5 razas**: Humanos, Elfos, Enanos, Hobbits, Orcos (3 personajes cada una)

## Estructura de clases
Character (superclase)

**── Character (Superclass)
├── 👤 Human
│   ├── ⚔️ Knight
│   └── 🏹 Ranger
├── 🧝 Elf
│   ├── ✨ HighElf
│   └── 🍃 WoodElf
├── 🧔 Dwarf
│   ├── 🛡️ DwarfWarrior
│   └── ⛏️ DwarfMiner
├── 👣 Hobbit
│   ├── 🗺️ AdventurousHobbit
│   └── 👨‍🌾 FarmerHobbit
└── 👹 Orc
├── 🦾 UrukHai
└── 💀 OrcShaman 

Captura de resultado esperado


<img width="821" height="497" alt="Captura resultado final ejercicio POO" src="https://github.com/user-attachments/assets/fcac0b7f-1f85-4c11-a15c-9079a91f3f97" />

Diagrama UML

<img width="1991" height="661" alt="theLordsOfTheRings drawio (1)" src="https://github.com/user-attachments/assets/45980d9e-1586-49a3-b418-e3aa072415fa" />


## Características técnicas
- **15 personajes** únicos del universo LOTR
- **Encapsulación total** (todos atributos private)
- **Polimorfismo dinámico** (impresión específica por tipo)
- **Herencia multinivel** (superclase → raza → subtipo)
- **Nomenclatura camelCase** estándar Java

## Instalación y ejecución

```bash
# Clonar repositorio
git clone <https://github.com/webermuros1-oss/theLordOfTheRings.git>
cd lotr-poo-java

# Compilar
javac -d . src/lotr/*.java

# Ejecutar
java lotr.Main



text
Human knight: Boromir, kingdom: Gondor, honor: 90, weapon: Sword, health: 100
Human ranger: Faramir, kingdom: Gondor, tracking: 85, weapon: Bow, health: 95
High elf: Elrond, magic: Light, wisdom: 100, weapon: Elven sword, health: 120
...
Tecnologías
Java 17+

POO: Encapsulación, Herencia, Polimorfismo

IDE recomendado: IntelliJ 


Hecho por Heber Paris Caamaño - Full Stack Developer
