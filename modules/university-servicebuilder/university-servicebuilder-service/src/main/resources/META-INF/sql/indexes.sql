create index IX_20A0D074 on UNIVERSITY_Teacher (groupId, college[$COLUMN_LENGTH:75$]);
create index IX_D2C4A0CB on UNIVERSITY_Teacher (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7A04DE0D on UNIVERSITY_Teacher (uuid_[$COLUMN_LENGTH:75$], groupId);