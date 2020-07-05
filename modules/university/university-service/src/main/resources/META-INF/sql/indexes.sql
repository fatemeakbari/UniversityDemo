create index IX_1218BDA1 on MYUD_Teacher (groupId, college[$COLUMN_LENGTH:75$]);
create index IX_C43C8DF8 on MYUD_Teacher (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3D00327A on MYUD_Teacher (uuid_[$COLUMN_LENGTH:75$], groupId);