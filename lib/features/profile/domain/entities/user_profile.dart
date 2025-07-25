import 'package:equatable/equatable.dart';

class UserProfile extends Equatable {
  final String id;
  final String name;
  final String? username;
  final String email;
  final bool termsAccepted;
  final bool onboarded;
  final String? nationalID;
  final String? avatarUrl;
  final String? bio;
  final int vibePoints;
  final String? phone;
  final DateTime createdAt;
  final DateTime updatedAt;

  const UserProfile({
    required this.id,
    required this.name,
    required this.email,
    required this.termsAccepted,
    required this.onboarded,
    required this.createdAt,
    required this.updatedAt,
    required this.bio,
    required this.phone,
    required this.username,
    required this.nationalID,
    required this.vibePoints,
    this.avatarUrl,
  });

  UserProfile copyWith({
    String? id,
    String? name,
    String? username,
    String? email,
    bool? termsAccepted,
    bool? onboarded,
    String? nationalID,
    String? avatarUrl,
    String? bio,
    int? vibePoints,
    String? phone,
    DateTime? createdAt,
    DateTime? updatedAt,
  }) {
    return UserProfile(
      id: id ?? this.id,
      name: name ?? this.name,
      username: username ?? this.username,
      email: email ?? this.email,
      termsAccepted: termsAccepted ?? this.termsAccepted,
      onboarded: onboarded ?? this.onboarded,
      nationalID: nationalID ?? this.nationalID,
      avatarUrl: avatarUrl ?? this.avatarUrl,
      bio: bio ?? this.bio,
      vibePoints: vibePoints ?? this.vibePoints,
      phone: phone ?? this.phone,
      createdAt: createdAt ?? this.createdAt,
      updatedAt: updatedAt ?? this.updatedAt,
    );
  }

  @override
  List<Object?> get props => [
    id,
    username,
    nationalID,
    name,
    email,
    termsAccepted,
    onboarded,
    avatarUrl,
    bio,
    vibePoints,
    phone,
    createdAt,
    updatedAt,
  ];

  @override
  bool? get stringify => true;
}
